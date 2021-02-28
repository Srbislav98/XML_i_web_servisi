import {Injectable} from '@angular/core';

declare const Xonomy: any;

@Injectable({
  providedIn: 'root'
})
export class XonomyObavestenjeService {

  constructor() {
  }

  public ObavestenjeSpecification = {
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
}