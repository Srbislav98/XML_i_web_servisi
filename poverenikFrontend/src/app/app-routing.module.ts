import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ResenjeCreateComponent } from './resenje-create/resenje-create.component';

const routes: Routes = [
  {
    path : 'resenje',
    component : ResenjeCreateComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
