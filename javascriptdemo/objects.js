var person=new Object();
person["firstname"]="john";
person["lastname"]="smith";
console.log(person);
var add= new Object();
add["street"]="help";
console.log(add);

//object creation 
var per={
    first:"add",
    last:"me",
    address:{ 
        city:"ny",
        state:"ap"
    }
}
console.log(per);
var change=JSON.stringify(per);
console.log(change);
console.log(per.address.state);
function greet(box)
{
    console.log("hi "+ box.first);
}
greet(per);




