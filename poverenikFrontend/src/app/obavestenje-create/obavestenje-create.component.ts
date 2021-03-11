import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { XonomyService } from './../SERVICE/xonomyObavestenje.service';
//import { XonomyService } from '../xonomyObavestenje.service';

declare const Xonomy: any;

@Component({
  selector: 'app-obavestenje-create',
  templateUrl: './obavestenje-create.component.html',
  styleUrls: ['./obavestenje-create.component.css']
})
export class ObavestenjeCreateComponent implements OnInit {

  constructor(private xonomyService: XonomyService, private router: Router) { }

  //private let cObavestenje:HTMLElement;

  ngOnInit(): void {
  }

  ngAfterViewInit(){
    let element = document.getElementById("cObavestenje");
    let specifikacija = this.xonomyService.ObavestenjeSpecification;
    let dsa =  '' +
    '<obavestenje xmlns="http://www.ftn.uns.ac.rs/obavestenjecir" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.ftn.uns.ac.rs/obavestenjecir file:obavestenjecir.xsd" xmlns:pred="http://www.ftn.uns.ac.rs/rdf/examples/predicate/" about="http://www.ftn.uns.ac.rs/rdf/obavestenjecir">' +
        '<naziv_organa property="pred:naziv" datatype="xs:string"> </naziv_organa>' +
        '<sediste_organa property="pred:sediste" datatype="xs:string"> </sediste_organa>' +
        '<broj_predmeta property="pred:sediste" datatype="xs:string"> </broj_predmeta>' +
        '<datum xsi:nil = "true" property="pred:datum" datatype="xs:date"> </datum>' +

        '<podnosilac_zahteva>' +
            '<ime property="pred:ime" datatype="xs:string"> </ime>' +
            '<prezime property="pred:prezime" datatype="xs:string"> </prezime>' +
            '<naziv> </naziv>' +
            '<adresa_podnosioca_zahteva property="pred:adresa" datatype="xs:string"> </adresa_podnosioca_zahteva>' +
        '</podnosilac_zahteva>' +

        '<naslov> </naslov>' +
        '<uvid>' +
            '<godina> </godina>' +
            '<opis_trazene_informacije> </opis_trazene_informacije>' +
            '<ime_dana> </ime_dana>' +
            '<broj_sati> </broj_sati>' +
            '<pocetak_akcije> </pocetak_akcije>' +
            '<kraj_akcije> </kraj_akcije>' +
            '<naziv_zgrade> </naziv_zgrade>' +
            '<naziv_ulice> </naziv_ulice>' +
            '<broj_ulice> </broj_ulice>' +
            '<broj_kanselarije> </broj_kanselarije>' +
        '</uvid>' +
        '<paragraf> </paragraf>' +
        '<troskovi_detaljno>' +
            '<kolicina_novca> </kolicina_novca>' +
        '</troskovi_detaljno>' +
        '<iznos_troskova> </iznos_troskova>' +

        '<dostavljeno>' +
            '<kojem_M._P._dostavlja> </kojem_M._P._dostavlja>' +
            '<arhiva> </arhiva>' +
        '</dostavljeno>' +
    '</obavestenje>';
    
    Xonomy.render(dsa, element, specifikacija)//{})
  }

  send(){
    //TODO
  }

  nazad(){
    this.router.navigate(['']);
  }

}
