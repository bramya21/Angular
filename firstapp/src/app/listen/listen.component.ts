import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listen',
  templateUrl: './listen.component.html',
  styleUrls: ['./listen.component.css']
})
export class ListenComponent implements OnInit {
  public speech:string;
  public prop:string;
  constructor() { }

  ngOnInit() {
  }
  onSpeak(pTextBox)
  {
    this.speech=pTextBox.value;
  }
}
