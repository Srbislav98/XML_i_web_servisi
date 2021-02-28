import { Component, OnInit } from '@angular/core';
import { XonomyService } from '../xonomyObavestenje.service';

declare const Xonomy: any;

@Component({
  selector: 'app-obavestenje-create',
  templateUrl: './obavestenje-create.component.html',
  styleUrls: ['./obavestenje-create.component.css']
})
export class ObavestenjeCreateComponent implements OnInit {

  constructor() { }

  //private let cObavestenje:HTMLElement;

  ngOnInit(): void {
  }

  ngAfterViewInit(){
    let element = document.getElementById("cObavestenje");
    let specifikacija = this.XonomyService.
    Xonomy.render("<obv>Obavestenje</obv>", element, {})
  }

}
