import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ResenjeCreateComponent } from './resenje-create/resenje-create.component';
import { ObavestenjeCreateComponent } from "./obavestenje-create/obavestenje-create.component"

const routes: Routes = [
  {
    path : 'resenje',
    component : ResenjeCreateComponent
  },
  {
    path : 'obavestenje',
    component : ObavestenjeCreateComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
