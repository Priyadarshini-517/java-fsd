import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// import { HttpClientModule } from '@angular/common/http';
// import { ServerComponent } from './server/server.component';
// import { BasicHighlightDirective } from './BasicHighlightDirective';
// import { NumbersComponent } from './numbers/numbers.component';
// import { AccountsComponent } from './accounts/accounts.component';
// import { AccountComponent } from './accounts/account/account.component';
// import { NewaccountComponent } from './accounts/newaccount/newaccount.component';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HomepageComponent } from './homepage/homepage.component';
import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';

@NgModule({
  declarations: [
    AppComponent,
    // ServerComponent,
    // NumbersComponent,
    // BasicHighlightDirective,
    // AccountsComponent,
    // AccountComponent,
    // NewaccountComponent,
    HomepageComponent,
    SigninComponent,
    SignupComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
