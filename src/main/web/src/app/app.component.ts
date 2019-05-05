import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  result:any = {};
  
constructor(private http:HttpClient){
    this.get();
}

get(){
  this.http.get('http://127.0.0.1:8080/test').subscribe(data=>{
    console.log(data);
    this.result = data;
  });
}

}
