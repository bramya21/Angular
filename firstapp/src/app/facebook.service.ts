import { Injectable } from '@angular/core';
import { post } from 'selenium-webdriver/http';

@Injectable({
  providedIn: 'root'
})
export class FacebookService {

  constructor() { }
  private _fbPostObj:fbPost=new fbPost();
  GetAllPosts(pUser:string)
  {
    var allPosts:fbPost[]=this._fbPostObj.getAllPosts();
    var _userPosts=[];
    allPosts.forEach(item=>{
      if(item.username==pUser)
    {
      _userPosts.push(item);
    }
    })
    return _userPosts;
  }

  GetAdDuration(pPostTitle:string,pUser:string)
  {

  }
}
class fbPost
{
  username:string;
  postTitle:string;
  postDescription:string;
  private _post:fbPost[]=[];
 
  getAllPosts():fbPost[]
  {
    if(this._post.length==0)
    {
    var _post1=new fbPost();
    _post1.username="Ramya";
    _post1.postTitle="First Post";
    _post1.postDescription="It's my fb";
    var _post2=new fbPost();
    _post2.username="Ravali";
    _post2.postTitle="Second Post";
    _post2.postDescription="Only mine";
    this._post.push(_post1);
    this._post.push(_post2);
    }
    return this._post;
  }
  getAdDuration(pPostTitle:string,pUser:string)
  {

  }
}
class fbAds
{
  postTitle:string;
  AdCost:number;
  AdDuration:number;
}
