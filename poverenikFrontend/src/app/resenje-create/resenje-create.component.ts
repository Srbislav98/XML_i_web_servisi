import { Router } from '@angular/router';
import { XonomyService } from './../SERVICE/xonomyResenje.service';
import { Component, OnInit } from '@angular/core';

declare const Xonomy: any;
@Component({
  selector: 'app-resenje-create',
  templateUrl: './resenje-create.component.html',
  styleUrls: ['./resenje-create.component.css']
})
export class ResenjeCreateComponent implements OnInit {

  constructor(private xonomyService: XonomyService, private router: Router) { }

  ngOnInit(): void {
  }

  ngAfterViewInit() {
    let element = document.getElementById("editor");
    let specification = this.xonomyService.ResenjeSpecification;
    let xmlString = '<resenje xmlns="http://www.ftn.uns.ac.rs/resenja"'+
    ' xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" '+
    '> '+
    '<odluka about="http://www.ftn.uns.ac.rs/rdf/resenje" property="pred:odluka" datatype="xs:string"> </odluka>'+
    '<levo about="http://www.ftn.uns.ac.rs/rdf/resenje">'+
        '<broj_zalbe property="pred:brojZalbe" datatype="xs:string"> </broj_zalbe>'+
    '</levo>'+
    '<desno about="http://www.ftn.uns.ac.rs/rdf/resenje">'+
        '<datum_zalbe property="pred:datumZalbe" datatype="xs:string"> </datum_zalbe>'+
    '</desno>'+
    '<opis_zalbe>'+
        '<zrtva> </zrtva>'+
    '</opis_zalbe>'+
    '</resenje>';
    
    Xonomy.render(xmlString, element, specification);
  }

  send(){

  }

  natrag(){
    this.router.navigate(['']);
  }
}
