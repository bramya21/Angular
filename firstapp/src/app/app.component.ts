import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TravelApp';
  public location:string="Manali";
  public city:string="Kullu Manali";
  public state:string="Himachal Pradesh";
  public country:string="India";
  public rating:number=10;
  onClickButton(loc,city,state,country,rating)
  {
      this.location=loc;
      this.city=city;
      this.state=state;
      this.country=country;
      this.rating=rating;
    console.log("updated");   
  }
}
