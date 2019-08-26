import { Component, OnInit, Input, Output } from '@angular/core';
import { Listener } from 'selenium-webdriver';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-speak',
  templateUrl: './speak.component.html',
  styleUrls: ['./speak.component.css']
})
export class SpeakComponent implements OnInit {
  
  @Input() wordsToBeSpoken:string;//[]
  @Output() speak=new EventEmitter();//()
  @Input() sampleNgModel:string;//[()]
  constructor() { }

  ngOnInit() {
  }

}
