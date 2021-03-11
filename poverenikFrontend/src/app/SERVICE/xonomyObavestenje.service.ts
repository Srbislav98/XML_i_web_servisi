import {Injectable} from '@angular/core';

declare const Xonomy: any;
@Injectable({
  providedIn: 'root'
})

export class XonomyService {
  constructor() {}

  public ObavestenjeSpecification = {
    elements: {
    "obavestenje":{
      menu:[{caption: 'Add paragraf',
      action: Xonomy.newElementChild,
      actionParameter: '<paragraf> </paragraf>',
      hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
        return jsElement.hasChildElement('paragraf');
      }
    }]
    },
      
      "naziv_organa":{
        hasText: true,
        oneliner: true,
        asker: Xonomy.askString,
      },
      "sediste_organa":{
        hasText: true,
        oneliner: true,
        asker: Xonomy.askString,
      },
      "broj_predmeta":{
        hasText: true,
        oneliner: true,
        asker: Xonomy.askNumber,
      },
      "datum":{
        hasText: true,
        oneliner: true,
        asker: Xonomy.askDate,
      },

      "podnosilac_zahteva":{},
        "ime":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },
        "prezime":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },
        "naziv":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },
        "adresa_podnosioca_zahteva":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },

      "naslov":{
        hasText: true,
        oneliner: true,
        asker: Xonomy.askString,
      },

      "uvid":{ },
        "godina":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },
        "opis_trazene_informacije":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },
        "ime_dana":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },
        "broj_sati":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },

        "paragraf":{
          hasText: true,
          asker: Xonomy.askString,
          mustBeAfter: ['naziv_organa',
          'sediste_organa',
          'broj_predmeta',
          'datum',
          'podnosilac_zahteva',
          'naslov',
          'uvid'],

          mustBeBefore: ['troskovi_detaljno'],
          
        },

        "troskovi_detaljno":{
          hasText: true,
          oneliner: false,
          asker: Xonomy.askNumber,
        },

        "iznos_troskova":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },

        "kojem_M._P._dostavlja":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },

        "arhiva":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },

        "kolicina_novca":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },

        
        "pocetak_akcije":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askTime,
        },

        "kraj_akcije":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askTime,
        },
     
        "naziv_zgrade":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },

        "naziv_ulice":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
        },
        
        "broj_ulice":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },

        "broj_kanselarije":{
          hasText: true,
          oneliner: true,
          asker: Xonomy.askNumber,
        },
    }
  };
}