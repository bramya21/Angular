import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { AboutComponent } from './about/about.component';
import { ErrorComponent } from './error/error.component';
import { ServicesComponent } from './services/services.component';
export const router:Routes=[
{path:'',redirectTo:"",pathMatch:"full"},
{path:'products',component:ProductsComponent},
{path:'about/:id/:value',component:AboutComponent,outlet:"footerOutlet"},
{path:'services',component:ServicesComponent,outlet:"footerOutlet"},
{path:'**',component:ErrorComponent}
];
@NgModule({
declarations: [],
imports: [
  CommonModule,
  RouterModule.forRoot(router)
],
exports:[RouterModule]
})
export class RoutingModule { }
