import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-http-promise',
  templateUrl: './http-promise.component.html',
  styleUrls: ['./http-promise.component.css']
})
export class HttpPromiseComponent  {

  myProp:object;
  constructor(public http:HttpClient)
  {

  }
  getCall()
  {
    
    
    this.http.get("http://localhost:8090/bank/transactions")  //observable
    .toPromise()  //converting to promise
    .then(
      (data)=>{this.myProp=data;}, //onsuccess
      (error)=>{console.error(error);}  //onfailure
    )
    .catch((catchederr)=>{console.log("In catch block");console.log(catchederr);})  //onerror
    .finally(()=>{console.log("In finally block");});  //endingstmt


  }

}
