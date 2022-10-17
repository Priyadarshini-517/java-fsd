import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl } from '@angular/forms'
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/service/employee.service';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  empDetail !: FormGroup;
  empObj : Employee = new Employee();
  empList : Employee[] = [];

  constructor(private formBuilder : FormBuilder, private empService : EmployeeService) { }

  ngOnInit(): void {

    this.getAllEmployee();

    this.empDetail = this.formBuilder.group({
      id : [''],
      name : [''],
      leaves: [''],
      email: ['']
    });    

  }

  addEmployee() {
    console.log(this.empDetail);
    this.empObj.id = this.empDetail.value.id;
    this.empObj.name = this.empDetail.value.name;
    this.empObj.leaves = this.empDetail.value.leaves;
    this.empObj.email = this.empDetail.value.email;

    this.empService.addEmployee(this.empObj).subscribe(res=>{
        console.log(res);
        this.getAllEmployee();
    },err=>{
        console.log(err);
    });

  }

  getAllEmployee() {
    this.empService.getAllEmployee().subscribe(res=>{
        this.empList = res;
    },err=>{
      console.log("error while fetching data.")
    });
  }

  editEmployee(emp : Employee) {
    this.empDetail.controls['id'].setValue(emp.id);
    this.empDetail.controls['name'].setValue(emp.name);
    this.empDetail.controls['email'].setValue(emp.email);
    this.empDetail.controls['leaves'].setValue(emp.leaves);

  }

  updateEmployee() {

    this.empObj.id = this.empDetail.value.id;
    this.empObj.name = this.empDetail.value.name;
    this.empObj.leaves = this.empDetail.value.leaves;
    this.empObj.email = this.empDetail.value.email;

    this.empService.updateEmployee(this.empObj).subscribe(res=>{
      console.log(res);
      this.getAllEmployee();
    },err=>{
      console.log(err);
    })

  }

  deleteEmployee(emp : Employee) {

    this.empService.deleteEmployee(emp).subscribe(res=>{
      console.log(res);
      alert('Employee deleted successfully');
      this.getAllEmployee();
    },err => {
      console.log(err);
    });

  }

}
