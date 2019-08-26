import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TwitterService {

  constructor() { }
  getTotalTweets(pUser:string)
  {
    if(pUser=="Ramya")
      return 50;
    return 30;
  }
}
