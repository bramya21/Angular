import { Component, OnInit,EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-c1',
  templateUrl: './c1.component.html',
  styleUrls: ['./c1.component.css']
})
export class C1Component implements OnInit {

  @Input() a:string;
  @Output() fun=new EventEmitter();
  constructor() { }

  ngOnInit() {
  }

}
