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
            actionParameter:'<resenje_zalbe>'+
            '<zrtva> </zrtva>'+
            '<optuzeni about="http://www.ftn.uns.ac.rs/rdf/resenje"> '+
            '<naziv_optuzenog property="pred:nazivOptuzenog" datatype="xs:string"> </naziv_optuzenog>'+
            '<sediste_optuzenog property="pred:sedisteOptuzenog" datatype="xs:string"> </sediste_optuzenog>'+
            '</optuzeni>'+
            '</resenje_zalbe>',
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
            actionParameter:'<obrazlozenja_zalbe> '+
              '<razlog_podnosenja_zalbe>'+
                '<zrtva> '+
                '</zrtva>'+
                '<datum_zalbe> '+
                '</datum_zalbe>'+
                '<optuzeni>'+
                  '<naziv_optuzenog> '+
                  '</naziv_optuzenog>'+
                  '<sediste_optuzenog> '+
                  '</sediste_optuzenog>'+
                '</optuzeni>'+
              '</razlog_podnosenja_zalbe>'+
              '<trazenje_odgovora_od_strane_optuzenog>'+
                '<datum_akcije_poverenika> '+
                '</datum_akcije_poverenika>'+
                '<optuzeni>'+
                  '<naziv_optuzenog> '+
                  '</naziv_optuzenog>'+
                  '<sediste_optuzenog> '+
                  '</sediste_optuzenog>'+
                '</optuzeni>'+
                '<zakon> '+
                '</zakon>'+
              '</trazenje_odgovora_od_strane_optuzenog>'+
              '<odluka> '+
              '</odluka>'+
              '<dogadjaj> '+
                '<optuzeni>'+
                  '<naziv_optuzenog> '+
                  '</naziv_optuzenog>'+
                  '<sediste_optuzenog> '+
                  '</sediste_optuzenog>'+
                '</optuzeni>'+
              '</dogadjaj>'+
              '<odgovor_na_dogadjaj>'+
                '<zakon> '+
                '</zakon>'+
              '</odgovor_na_dogadjaj>'+
            '</obrazlozenja_zalbe>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('obrazlozenja_zalbe');
            }
          },
          {
            caption: 'Add <fusnota>',
            action: Xonomy.newElementChild,
            actionParameter:'<fusnota> </fusnota>',
            
          },
          {
            caption: 'Add <poverenik>',
            action: Xonomy.newElementChild,
            actionParameter:'<poverenik about="http://www.ftn.uns.ac.rs/rdf/resenje">'+ 
            '<ime_poverenika property="pred:imePoverenika" datatype="xs:string"> '+'</ime_poverenika>'+
            '</poverenik>',
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
          mustBeBefore:['datum_obavestenja','datum_zahteva','zakon','rok_trajanja_mora_izvrsi_resenje',],
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <optuzeni>',
            action: Xonomy.deleteElement
          },
           
          {
            caption: 'Add <broj_obavestenja>',
            action: Xonomy.newElementChild,
            actionParameter:'<broj_obavestenja> </broj_obavestenja>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('broj_obavestenja');
            }
          }

          ]
        },
        'broj_obavestenja':{
          mustBeAfter: ['sediste_optuzenog','datum_izvrsenja','rok_od_prijema_zahteva'],
          mustBeBefore:['datum_obavestenja','datum_smrti','lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora','rok_o_obavestenju_da_li_poseduje_informacije','zakon'],
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
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja','optuzeni','datum_do_kada_mora_da_se_izvrsi','razlog_zahteva_za_informacije_od_javnog_znacaja','izvrsenje_resenja','datum_izvrsenja','rok_od_prijema_zahteva','broj_obavestenja'],
          mustBeBefore:['datum_zahteva','zakon','rok_trajanja_provera','datum_smrti','lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora','rok_o_obavestenju_da_li_poseduje_informacije'],
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
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja','optuzeni','datum_obavestenja','rok_trajanja_provera','datum_do_kada_mora_da_se_izvrsi','izvrsenje_resenja'],
          mustBeBefore:['zakon','razlog_zahteva_za_informacije_od_javnog_znacaja'],
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
          mustBeAfter: ['zrtva','su.br.','datum_pokretanja','optuzeni','datum_obavestenja','datum_zahteva','datum_izvrsenja','rok_od_prijema_zahteva','broj_obavestenja','datum_smrti','lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora'],
          mustBeBefore:['datum_odgovora_na_zalbu','sta_se_trazilo','rok_o_obavestenju_da_li_poseduje_informacije'],
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
        'resenje_zalbe':{
          hasText: true,
          mustBeAfter: ['opis_zalbe','naslov'],
          mustBeBefore: ['podnaslov','obrazlozenja_zalbe','fusnota','poverenik'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <resenje_zalbe>',
            action: Xonomy.deleteElement
          },
          {
            caption: 'Add <optuzeni>',
              action: Xonomy.newElementChild,
              actionParameter:'<optuzeni>'+
              '<naziv_optuzenog property="pred:nazivOptuzenog" datatype="xs:string"> </naziv_optuzenog>'+
              '<sediste_optuzenog property="pred:sedisteOptuzenog" datatype="xs:string"> </sediste_optuzenog>'+ 
              '</optuzeni>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('optuzeni');
              }
          },
          {
            caption: 'Add <rok_trajanja_mora_izvrsi_resenje>',
              action: Xonomy.newElementChild,
              actionParameter:'<rok_trajanja_mora_izvrsi_resenje> </rok_trajanja_mora_izvrsi_resenje>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('rok_trajanja_mora_izvrsi_resenje');
              }
          },
          {
            caption: 'Add <dokument_koji_se_trazi>',
              action: Xonomy.newElementChild,
              actionParameter:'<dokument_koji_se_trazi> </dokument_koji_se_trazi>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('dokument_koji_se_trazi');
              }
          },
          {
            caption: 'Add <operacije_koje_optuzeni_mora_da_izvrsi>',
              action: Xonomy.newElementChild,
              actionParameter:'<operacije_koje_optuzeni_mora_da_izvrsi>'+ 
              '<privatne_informacije_koje_optuzeni_mora_da_zastiti> '+
              '</privatne_informacije_koje_optuzeni_mora_da_zastiti>'+
              '</operacije_koje_optuzeni_mora_da_izvrsi>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('operacije_koje_optuzeni_mora_da_izvrsi');
              }
          },
          {
            caption: 'Add <datum_podnetog_zahteva>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_podnetog_zahteva> </datum_podnetog_zahteva>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_podnetog_zahteva');
              }
          }
          ,
          {
            caption: 'Add <datum_obavestenja>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_obavestenja> </datum_obavestenja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_obavestenja');
              }
          },
          {
            caption: 'Add <rok_trajanja_provera>',
              action: Xonomy.newElementChild,
              actionParameter:'<rok_trajanja_provera> </rok_trajanja_provera>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('rok_trajanja_provera');
              }
          },
          {
            caption: 'Add <datum_zahteva>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_zahteva> </datum_zahteva>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_zahteva');
              }
          }

          ]
        },
        'rok_trajanja_mora_izvrsi_resenje':{
          hasText: true,
          mustBeAfter: ['optuzeni'],
          mustBeBefore: ['zrtva'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <rok_trajanja_mora_izvrsi_resenje>',
            action: Xonomy.deleteElement
          }]
        },
        'dokument_koji_se_trazi':{
          hasText: true,
          oneliner: true,
          mustBeAfter: ['zrtva'],
          mustBeBefore: ['operacije_koje_optuzeni_mora_da_izvrsi','datum_podnetog_zahteva','optuzeni'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <dokument_koji_se_trazi>',
            action: Xonomy.deleteElement
          }]
        },
        'operacije_koje_optuzeni_mora_da_izvrsi':{
          hasText: true,
          mustBeAfter: ['zrtva','dokument_koji_se_trazi'],
          mustBeBefore: ['datum_podnetog_zahteva','optuzeni'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <operacije_koje_optuzeni_mora_da_izvrsi>',
            action: Xonomy.deleteElement
          },
          {
            caption: 'Add <privatne_informacije_koje_optuzeni_mora_da_zastiti>',
              action: Xonomy.newElementChild,
              actionParameter:'<privatne_informacije_koje_optuzeni_mora_da_zastiti> </privatne_informacije_koje_optuzeni_mora_da_zastiti>'
          }]
        },
        'privatne_informacije_koje_optuzeni_mora_da_zastiti':{
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <privatne_informacije_koje_optuzeni_mora_da_zastiti>',
            action: Xonomy.deleteElement
          }]
        },
        'datum_podnetog_zahteva':{
          hasText: true,
          oneliner: true,
          mustBeAfter: ['zrtva','dokument_koji_se_trazi','operacije_koje_optuzeni_mora_da_izvrsi'],
          mustBeBefore: ['optuzeni','datum_izvrsenja'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_podnetog_zahteva>',
            action: Xonomy.deleteElement
          }]
        },
        'rok_trajanja_provera':{
          hasText: true,
          mustBeAfter: ['optuzeni','datum_obavestenja'],
          mustBeBefore: ['datum_zahteva'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <rok_trajanja_provera>',
            action: Xonomy.deleteElement
          }]
        },
        'datum_do_kada_mora_da_se_izvrsi':{
          hasText: true,
          oneliner: true,
          mustBeAfter: ['optuzeni'],
          mustBeBefore: ['datum_obavestenja','datum_zahteva'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <razlog_podnosenja_zalbe>',
            action: Xonomy.deleteElement
          }]
        },
        'sta_se_trazilo':{
          hasText: true,
          mustBeAfter: ['zakon'],
          mustBeBefore: ['datum_odgovora_na_zalbu'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <sta_se_trazilo>',
            action: Xonomy.deleteElement
          }]
        },
        'datum_odgovora_na_zalbu':{
          hasText: true,
          oneliner: true,
          mustBeAfter: ['sta_se_trazilo'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_odgovora_na_zalbu>',
            action: Xonomy.deleteElement
          }]
        },
        'razlog_podnosenja_zalbe':{
          hasText: true,
          asker: Xonomy.askString,
          menu: [
          {
            caption: 'Add <datum_do_kada_mora_da_se_izvrsi>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_do_kada_mora_da_se_izvrsi> </datum_do_kada_mora_da_se_izvrsi>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_do_kada_mora_da_se_izvrsi');
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
          }
        ]
        },
        'trazenje_odgovora_od_strane_optuzenog':{
          hasText: true,
          asker: Xonomy.askString,
          menu: [
          {
            caption: 'Add <zakon>',
              action: Xonomy.newElementChild,
              actionParameter:'<zakon> </zakon>',
              
          },
          {
            caption: 'Add <sta_se_trazilo>',
              action: Xonomy.newElementChild,
              actionParameter:'<sta_se_trazilo> </sta_se_trazilo>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('sta_se_trazilo');
              }
          },
          {
            caption: 'Add <datum_odgovora_na_zalbu>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_odgovora_na_zalbu> </datum_odgovora_na_zalbu>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_odgovora_na_zalbu');
              }
          }
        ]
        },
        'dogadjaj':{
          hasText: true,
          asker: Xonomy.askString,
          menu: [
          {
            caption: 'Add <datum_podnetog_zahteva>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_podnetog_zahteva> </datum_podnetog_zahteva>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_podnetog_zahteva');
              }
          },
          {
            caption: 'Add <zrtva>',
              action: Xonomy.newElementChild,
              actionParameter:'<zrtva> </zrtva>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('zrtva');
              }
          },
          {
            caption: 'Add <datum_izvrsenja>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_izvrsenja> </datum_izvrsenja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_izvrsenja');
              }
          },
          {
            caption: 'Add <izvrsenje_resenja>',
              action: Xonomy.newElementChild,
              actionParameter:'<izvrsenje_resenja> </izvrsenje_resenja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('izvrsenje_resenja');
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
            caption: 'Add <razlog_zahteva_za_informacije_od_javnog_znacaja>',
              action: Xonomy.newElementChild,
              actionParameter:'<razlog_zahteva_za_informacije_od_javnog_znacaja> '+ 
              '<informacija> </informacija>'+
              '</razlog_zahteva_za_informacije_od_javnog_znacaja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('razlog_zahteva_za_informacije_od_javnog_znacaja');
              }
          },
          {
            caption: 'Add <datum_obavestenja>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_obavestenja> </datum_obavestenja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_obavestenja');
              }
          }
        ]
        },
        'zrtva':{
          mustBeBefore: ['datum_izvrsenja','optuzeni'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <zrtva>',
            action: Xonomy.deleteElement
          }]
        },
        'datum_izvrsenja':{
          mustBeAfter:['zrtva'],
          mustBeBefore: ['optuzeni','rok_od_prijema_zahteva','broj_obavestenja','datum_obavestenja','datum_smrti','lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora','zakon','rok_o_obavestenju_da_li_poseduje_informacije'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_izvrsenja>',
            action: Xonomy.deleteElement
          }]
        },
        'izvrsenje_resenja':{
          mustBeAfter: ['optuzeni'],
          mustBeBefore:['datum_zahteva','razlog_zahteva_za_informacije_od_javnog_znacaja','datum_obavestenja'],
          hasText: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <izvrsenje_resenja>',
            action: Xonomy.deleteElement
          }]
        },
        
        'razlog_zahteva_za_informacije_od_javnog_znacaja':{
          mustBeAfter: ['izvrsenje_resenja','optuzeni','datum_zahteva'],
          mustBeBefore:['datum_obavestenja'],
          hasText: true,
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <razlog_zahteva_za_informacije_od_javnog_znacaja>',
            action: Xonomy.deleteElement
          },
          {
            caption: 'Add <informacija>',
              action: Xonomy.newElementChild,
              actionParameter:'<informacija> </informacija>',
              
          }]
        },
        'informacija':{
          hasText: true,
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <informacija>',
            action: Xonomy.deleteElement
          }]
        },
        'odgovor_na_dogadjaj':{
          hasText: true,
          asker: Xonomy.askString,
          menu: [
          {
            caption: 'Add <datum_izvrsenja>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_izvrsenja> </datum_izvrsenja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_izvrsenja');
              }
          },
          {
            caption: 'Add <rok_od_prijema_zahteva>',
              action: Xonomy.newElementChild,
              actionParameter:'<rok_od_prijema_zahteva> </rok_od_prijema_zahteva>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('rok_od_prijema_zahteva');
              }
          },
          {
            caption: 'Add <broj_obavestenja>',
              action: Xonomy.newElementChild,
              actionParameter:'<broj_obavestenja> </broj_obavestenja>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('broj_obavestenja');
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
            caption: 'Add <datum_smrti>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_smrti> </datum_smrti>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_smrti');
              }
          },
          {
            caption: 'Add <lokacija_smrti>',
              action: Xonomy.newElementChild,
              actionParameter:'<lokacija_smrti> </lokacija_smrti>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('lokacija_smrti');
              }
          },
          {
            caption: 'Add <datum_smrti_policija>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_smrti_policija> </datum_smrti_policija>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_smrti_policija');
              }
          },
          {
            caption: 'Add <datum_izlaska_inspektora>',
              action: Xonomy.newElementChild,
              actionParameter:'<datum_izlaska_inspektora> </datum_izlaska_inspektora>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('datum_izlaska_inspektora');
              }
          },
          {
            caption: 'Add <zakon>',
              action: Xonomy.newElementChild,
              actionParameter:'<zakon> </zakon>',
              
          },
          {
            caption: 'Add <rok_o_obavestenju_da_li_poseduje_informacije>',
              action: Xonomy.newElementChild,
              actionParameter:'<rok_o_obavestenju_da_li_poseduje_informacije> </rok_o_obavestenju_da_li_poseduje_informacije>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('rok_o_obavestenju_da_li_poseduje_informacije');
              }
          }
        ]
        },
        'rok_od_prijema_zahteva':{
          mustBeAfter:['datum_izvrsenja'],
          mustBeBefore:['broj_obavestenja','datum_obavestenja','datum_smrti','lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora','zakon','rok_o_obavestenju_da_li_poseduje_informacije'],
          hasText: true,
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <rok_od_prijema_zahteva>',
            action: Xonomy.deleteElement
          },]
        },
        
        'datum_smrti':{
          mustBeAfter:['datum_izvrsenja','broj_obavestenja','datum_obavestenja','rok_od_prijema_zahteva'],
          mustBeBefore:['lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora','zakon','rok_o_obavestenju_da_li_poseduje_informacije'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_smrti>',
            action: Xonomy.deleteElement
          },]
        },
        'lokacija_smrti':{
          mustBeAfter:['datum_izvrsenja','broj_obavestenja','datum_obavestenja','datum_smrti','rok_od_prijema_zahteva'],
          mustBeBefore:['datum_smrti_policija','datum_izlaska_inspektora','zakon','rok_o_obavestenju_da_li_poseduje_informacije'],
          hasText: true,
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <lokacija_smrti>',
            action: Xonomy.deleteElement
          },]
        },
        'datum_smrti_policija':{
          mustBeAfter:['datum_izvrsenja','broj_obavestenja','datum_obavestenja','datum_smrti','lokacija_smrti','rok_od_prijema_zahteva'],
          mustBeBefore:['datum_smrti_policija','datum_izlaska_inspektora','zakon','rok_o_obavestenju_da_li_poseduje_informacije'],
          hasText: true,
          oneliner: true,
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_smrti_policija>',
            action: Xonomy.deleteElement
          },]
        },
        'datum_izlaska_inspektora':{
          mustBeAfter:['datum_izvrsenja','broj_obavestenja','datum_obavestenja','datum_smrti','lokacija_smrti','datum_smrti_policija','rok_od_prijema_zahteva'],
          mustBeBefore:['zakon','rok_o_obavestenju_da_li_poseduje_informacije'],
          hasText: true,
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <datum_izlaska_inspektora>',
            action: Xonomy.deleteElement
          },]
        },
        'rok_o_obavestenju_da_li_poseduje_informacije':{
          mustBeAfter:['datum_izvrsenja','broj_obavestenja','datum_obavestenja','datum_smrti','lokacija_smrti','datum_smrti_policija','datum_izlaska_inspektora','zakon','rok_od_prijema_zahteva'],
          hasText: true,
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <rok_o_obavestenju_da_li_poseduje_informacije>',
            action: Xonomy.deleteElement
          },]
        },
        'obrazlozenja_zalbe':{
          hasText: true,
          mustBeAfter:['naslov','resenje_zalbe','podnaslov'],
          mustBeBefore:['poverenik','fusnota'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Add <prekrsaj>',
              action: Xonomy.newElementChild,
              actionParameter:'<prekrsaj>' +
              '<zakon> </zakon>'+
              '</prekrsaj>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('prekrsaj');
              }
          },
          {
            caption: 'Add <sta_optuzeni_mora_da_uradi>',
              action: Xonomy.newElementChild,
              actionParameter:'<sta_optuzeni_mora_da_uradi>' +
              '<zakon> </zakon>'+
              '</sta_optuzeni_mora_da_uradi>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('sta_optuzeni_mora_da_uradi');
              }
          },
          {
            caption: 'Add <upustvo>',
              action: Xonomy.newElementChild,
              actionParameter:'<upustvo>' +
              '<zakon> </zakon>'+
              '<rok_za_pokretanje_upravnog_spora> '+'</rok_za_pokretanje_upravnog_spora'+
              '<taksa_tuzbe> '+ '</taksa_tuzbe>'+
              '</upustvo>',
              hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
                return jsElement.hasChildElement('upustvo');
              }
          },
        ]
        },
        'prekrsaj':{
          hasText: true,
          mustBeAfter:['odgovor_na_dogadjaj'],
          mustBeBefore:['sta_optuzeni_mora_da_uradi','upustvo'],
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <prekrsaj>',
            action: Xonomy.deleteElement
          },
        {
          caption: 'Add <datum_izvrsenja>',
        action: Xonomy.newElementChild,
        actionParameter:'<datum_izvrsenja> </datum_izvrsenja>',
        hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
          return jsElement.hasChildElement('datum_izvrsenja');
        }},
        {
          caption: 'Add <broj_obavestenja>',
        action: Xonomy.newElementChild,
        actionParameter:'<broj_obavestenja> </broj_obavestenja>',
        hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
          return jsElement.hasChildElement('broj_obavestenja');
        }},
        {
          caption: 'Add <datum_obavestenja>',
        action: Xonomy.newElementChild,
        actionParameter:'<datum_obavestenja> </datum_obavestenja>',
        hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
          return jsElement.hasChildElement('datum_obavestenja');
        }},
        {
          caption: 'Add <datum_izlaska_inspektora>',
        action: Xonomy.newElementChild,
        actionParameter:'<datum_izlaska_inspektora> </datum_izlaska_inspektora>',
        hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
          return jsElement.hasChildElement('datum_izlaska_inspektora');
        }},
        {
          caption: 'Add <zakon>',
        action: Xonomy.newElementChild,
        actionParameter:'<zakon> </zakon>',
        },
        ]
        },
        'sta_optuzeni_mora_da_uradi':{
          hasText: true,
          mustBeAfter:['prekrsaj'],
          mustBeBefore:['upustvo'],
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <sta_optuzeni_mora_da_uradi>',
            action: Xonomy.deleteElement
          },
          {
            caption: 'Add <optuzeni>',
            action: Xonomy.newElementChild,
            actionParameter:'<optuzeni>'+
            '<naziv_optuzenog property="pred:nazivOptuzenog" datatype="xs:string"> </naziv_optuzenog>'+
            '<sediste_optuzenog property="pred:sedisteOptuzenog" datatype="xs:string"> </sediste_optuzenog>'+ 
            '</optuzeni>',
            hideIf: function(jsElement: { hasChildElement: (arg0: string) => any; }) {
              return jsElement.hasChildElement('optuzeni');
            }
          },
          {
            caption: 'Add <zakon>',
            action: Xonomy.newElementChild,
            actionParameter:'<zakon> </zakon>',
            
          },
        
        ]
        },
        'upustvo':{
          hasText: true,
          mustBeAfter:['sta_optuzeni_mora_da_uradi','prekrsaj'],
          
          
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <upustvo>',
            action: Xonomy.deleteElement
          },
        ]
        },
        'poverenik':{
          hasText: true,
          mustBeAfter:['naslov','resenje_zalbe','podnaslov','obrazlozenja_zalbe','fusnota'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <poverenik>',
            action: Xonomy.deleteElement
          },]
        },
        'fusnota':{
          hasText: true,
          mustBeAfter:['naslov','resenje_zalbe','podnaslov','obrazlozenja_zalbe'],
          mustBeBefore:['poverenik'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <fusnota>',
            action: Xonomy.deleteElement
          },]
        },
        'naslov':{
          hasText: true,
          oneliner: true,
          mustBeBefore:['resenje_zalbe','podnaslov','obrazlozenja_zalbe','fusnota','poverenik'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <naslov>',
            action: Xonomy.deleteElement
          },]
        },
        'podnaslov':{
          hasText: true,
          oneliner: true,
          mustBeAfter:['naslov','resenje_zalbe'],
          mustBeBefore:['obrazlozenja_zalbe','poverenik','fusnota'],
          asker: Xonomy.askString,
          menu: [{
            caption: 'Obrisi <podnaslov>',
            action: Xonomy.deleteElement
          },]
        },
        'odluka':{
          hasText: true,
        },
        'broj_zalbe':{
          hasText: true,
        },
        'datum_zalbe':{
          hasText: true,
        },
        'naziv_optuzenog':{
          hasText: true,
        },
        'sediste_optuzenog':{
          hasText: true,
        },
        'datum_akcije_poverenika':{
          hasText: true,
          oneliner: true,
        },
        'rok_za_pokretanje_upravnog_spora':{
          hasText: true,
        },
        'taksa_tuzbe':{
          hasText: true,
        },
        'ime_poverenika':{
          hasText: true,
        }

      }
    }

}