import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Subscription} from 'rxjs';
@Component({
  selector: 'app-httpobservable',
  templateUrl: './httpobservable.component.html',
  styleUrls: ['./httpobservable.component.css']
})
export class HttpobservableComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.getCall();
  }
  ngOnDestroy()
{
  this.subscribedData.unsubscribe();
}

  public subscribedData:Subscription;
  getCall()
  {
    this.subscribedData=this.http.get("http://jsonplaceholder.typicode.com/posts").subscribe((data)=>{
      console.log(data);
      });
    //ALternative
      // this.http.get("").subscribe((data)=>{},(err)=>{});


  }

}
