import { Component, OnInit } from '@angular/core';
//import { XonomyService } from '../xonomyObavestenje.service';

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
    //let specifikacija = this.XonomyService.
    let dsa = {
      elements: {
        "obavestenje":{
          "naziv_organa":{},
          "sediste_organa":{},
          "broj_predmeta":{},
          "datum":{},
  
          "podnosilac_zahteva":{
              "ime":{},
              "prezime":{},
              "naziv":{},
              "adresa_podnosioca_zahteva":{},
          },
  
          "naslov":{},
  
          "uvid":{
              "godina":{},
              "opis_trazene_informacije":{},
              "ime_dana":{},
              "broj_sati":{},
          },
        },
      }
    };
    Xonomy.render(dsa, element, {})
  }

}
