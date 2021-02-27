/* eslint-disable no-unused-vars */
/* eslint-disable import/no-unresolved */
/* eslint-disable import/prefer-default-export */
import { ContactsComponent } from './views/contacts/contacts.component';
import { GenerateComponent } from './views/generate/generate.component';
import { HomeComponent } from './views/home/home.component';
/* eslint-disable import/order */
/* eslint-disable import/order */
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  {
    path: '',
    component: HomeComponent,
    data: { animation: 'HomePage' },
  },

  {
    path: 'generate',
    component: GenerateComponent,
    data: { animation: 'GeneratePage' },
  },

  {
    path: 'contacts',
    component: ContactsComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
