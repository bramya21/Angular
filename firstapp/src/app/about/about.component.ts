import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router'
@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  sub:any;
  routeId:any;
  routeValue:any;

  constructor(private route:ActivatedRoute) { }

  ngOnInit() {
    this.sub=this.route.params.subscribe(params=>{
      this.routeId=params['id'];
      this.routeValue=params['value']
    });
  }

}
