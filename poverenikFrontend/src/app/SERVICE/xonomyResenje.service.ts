import {Injectable} from '@angular/core';

declare const Xonomy: any;

@Injectable({
  providedIn: 'root'
})

export class XonomyService {
    constructor() {
    }

    public ResenjeSpecification = {
      elements: {
        'resenje':{
          menu:[{
            caption: 'Add <naslov>',
            action: Xonomy.newElementChild,
            actionParameter:'<naslov> </naslov>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('naslov');
            }
          },
          {
            caption: 'Add <resenje_zalbe>',
            action: Xonomy.newElementChild,
            actionParameter:'<resenje_zalbe> </resenje_zalbe>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('resenje_zalbe');
            }
          },
          {
            caption: 'Add <podnaslov>',
            action: Xonomy.newElementChild,
            actionParameter:'<podnaslov> </podnaslov>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('podnaslov');
            }
          },
          {
            caption: 'Add <obrazlozenja_zalbe>',
            action: Xonomy.newElementChild,
            actionParameter:'<obrazlozenja_zalbe> </obrazlozenja_zalbe>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('obrazlozenja_zalbe');
            }
          },
          {
            caption: 'Add <fusnota>',
            action: Xonomy.newElementChild,
            actionParameter:'<fusnota> </fusnota>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('fusnota');
            }
          },
          {
            caption: 'Add <poverenik>',
            action: Xonomy.newElementChild,
            actionParameter:'<poverenik about="http://www.ftn.uns.ac.rs/rdf/resenje"> </poverenik>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('poverenik');
            }
          }
        ]
        },
        'opis_zalbe':{
          hasText: true,
          menu:[{
            caption: 'Add <datum_izbora>',
            action: Xonomy.newElementChild,
            actionParameter:'<datum_izbora> </datum_izbora>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('datum_izbora');
            }
          },
          {
            caption: 'Add <su.br.>',
            action: Xonomy.newElementChild,
            actionParameter:'<su.br.> </su.br.>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('su.br.');
            }
          },
          {
            caption: 'Add <datum_pokretanja>',
            action: Xonomy.newElementChild,
            actionParameter:'<datum_pokretanja> </datum_pokretanja>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('datum_pokretanja');
            }
          },
          {
            caption: 'Add <optuzeni>',
            action: Xonomy.newElementChild,
            actionParameter:'<optuzeni about="http://www.ftn.uns.ac.rs/rdf/resenje"> '+
            '<naziv_optuzenog property="pred:nazivOptuzenog" datatype="xs:string"> </naziv_optuzenog>'+
            '<sediste_optuzenog property="pred:sedisteOptuzenog" datatype="xs:string"> </sediste_optuzenog>'+
            '</optuzeni>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('optuzeni');
            }
          },
          {
            caption: 'Add <datum_obavestenja>',
            action: Xonomy.newElementChild,
            actionParameter:'<datum_obavestenja> </datum_obavestenja>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('datum_obavestenja');
            }
          },
          {
            caption: 'Add <datum_zahteva>',
            action: Xonomy.newElementChild,
            actionParameter:'<datum_zahteva> </datum_zahteva>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('datum_zahteva');
            }
          },
          {
            caption: 'Add <zakon>',
            action: Xonomy.newElementChild,
            actionParameter:'<zakon> </zakon>',
            
          }
        ]
        },
        'datum_izbora':{
          mustBeBefore: ['zrtva'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_izbora>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'su.br.':{
          mustBeAfter: ['zrtva'],
          mustBeBefore:['datum_pokretanja','optuzeni','datum_obavestenja','datum_zahteva','zakon'],
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <su.br.>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'datum_pokretanja':{
          mustBeAfter: ['zrtva','su.br.'],
          mustBeBefore:['optuzeni','datum_obavestenja','datum_zahteva','zakon'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_pokretanja>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'optuzeni':{
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja'],
          mustBeBefore:['datum_obavestenja','datum_zahteva','zakon'],
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <optuzeni>',
            action: Xonomy.deleteElement
          },
           
          {
            caption: 'Add <broj_obavestenja>',
            action: Xonomy.newElementChild,
            actionParameter:'<broj_obavestenja property="pred:brojObavestenja" datatype="xs:string"> </broj_obavestenja>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('broj_obavestenja');
            }
          }

          ]
        },
        'broj_obavestenja':{
          mustBeAfter: ['sediste_optuzenog'],
          
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <broj_obavestenja>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'datum_obavestenja':{
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja','optuzeni'],
          mustBeBefore:['datum_zahteva','zakon'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_obavestenja>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'datum_zahteva':{
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja','optuzeni','datum_obavestenja'],
          mustBeBefore:['zakon'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_zahteva>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'zakon':{
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja','optuzeni','datum_obavestenja','datum_zahteva'],
          
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <zakon>',
            action: Xonomy.deleteElement
          },
          {
            caption: 'Add <clan>',
              action: Xonomy.newElementChild,
              actionParameter:'<clan> </clan>',
          },
          {
            caption: 'Add <stav>',
              action: Xonomy.newElementChild,
              actionParameter:'<stav> </stav>',
          },
          {
            caption: 'Add <tacka>',
              action: Xonomy.newElementChild,
              actionParameter:'<tacka> </tacka>',
          },
          {
            caption: 'Add <naziv_zakona>',
              action: Xonomy.newElementChild,
              actionParameter:'<naziv_zakona> </naziv_zakona>',
          },
          {
            caption: 'Add <naziv_sluzbenog_glasnika>',
              action: Xonomy.newElementChild,
              actionParameter:'<naziv_sluzbenog_glasnika> </naziv_sluzbenog_glasnika>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('naziv_sluzbenog_glasnika');
              }
          },
          {
            caption: 'Add <broj_sl.>',
              action: Xonomy.newElementChild,
              actionParameter:'<broj_sl.> </broj_sl.>',
          }
          ]
        },
        'clan':{
          mustBeBefore: ['stav','tacka','naziv_zakona','naziv_sluzbenog_glasnika','broj_sl.'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <clan>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'stav':{
          mustBeAfter: ['clan'],
          mustBeBefore: ['tacka','naziv_zakona','naziv_sluzbenog_glasnika','broj_sl.'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <stav>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'tacka':{
          mustBeAfter: ['clan','stav'],
          mustBeBefore: ['naziv_zakona','naziv_sluzbenog_glasnika','broj_sl.'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <tacka>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'naziv_zakona':{
          mustBeAfter: ['clan','stav','tacka'],
          mustBeBefore: ['naziv_sluzbenog_glasnika','broj_sl.'],
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <naziv_zakona>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'naziv_sluzbenog_glasnika':{
          mustBeAfter: ['clan','stav','tacka','naziv_zakona'],
          mustBeBefore: ['broj_sl.'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <naziv_sluzbenog_glasnika>',
            action: Xonomy.deleteElement
          }
          ]
        },
        'broj_sl.':{
          mustBeAfter: ['clan','stav','tacka','naziv_zakona','naziv_sluzbenog_glasnika'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <broj_sl.>',
            action: Xonomy.deleteElement
          }
          ]
        },
      }
    }

}