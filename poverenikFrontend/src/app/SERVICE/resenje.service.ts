import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Resenje } from './../MODEL/Resenje';

@Injectable({
    providedIn: 'root'
  })
  export class ResenjeService {
  
    constructor(private http: HttpClient) { }
    private path = "http://localhost:8080/api/resenja/xonomy"
    
  
    sendXml(entity: Resenje) {
      return this.http.post(this.path, entity);
    }
  }