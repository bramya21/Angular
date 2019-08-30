import { Component, OnInit } from '@angular/core';
import { BuiltinType, identifierModuleUrl } from '@angular/compiler';
import { UserIdleService } from 'angular-user-idle';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private userIdle: UserIdleService) { }

  ngOnInit() {
     //Start watching for user inactivity.
     this.userIdle.startWatching();
    
     // Start watching when user idle is starting.
     this.userIdle.onTimerStart().subscribe(count => console.log(count));
     
     // Start watch when time is up.
     this.userIdle.onTimeout().subscribe(() => alert("Session expired"));
  }
  stop() {
    this.userIdle.stopTimer();
  }
 
  stopWatching() {
    this.userIdle.stopWatching();
  }
 
  startWatching() {
    this.userIdle.startWatching();
  }
 
  restart() {
    this.userIdle.resetTimer();
  }
  public username:string;
  public password:string;
  public loginStatus:string;
  public Login(colStatus:any,imgStatus:any)
  {
    
    if(this.username=="admin" && this.password=="nimda")
    {  this.loginStatus="Successful";
     colStatus.style="color:green";
     //colStatus.disabled=true;
     imgStatus.src="/assets/download.jpg";
  
  }
    else
     { this.loginStatus="Invalid";colStatus.style="color:red";}
    

  }
}
