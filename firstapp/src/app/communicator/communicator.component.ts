import { Component, OnInit } from '@angular/core';
import { FacebookService } from '../facebook.service';
import { TwitterService } from '../twitter.service';

@Component({
  selector: 'app-communicator',
  templateUrl: './communicator.component.html',
  styleUrls: ['./communicator.component.css']
})
export class CommunicatorComponent implements OnInit {

  constructor(public pFbService:FacebookService, public pTwitter:TwitterService) { }
  userPosts=[];

  ngOnInit() {
  }
  getFbPosts(pUser:string){
    //calling underlying service
    this.userPosts=this.pFbService.GetAllPosts(pUser); 
  }
}
