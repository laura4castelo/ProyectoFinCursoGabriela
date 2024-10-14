import { Component, OnInit } from '@angular/core';
import { Cancion } from '../_modelo/cancion';
import { CancionService } from '../_servicio/cancion.service';

@Component({
  selector: 'app-mas-nuevas',
  standalone: true,
  imports: [],
  templateUrl: './mas-nuevas.component.html',
  styleUrl: './mas-nuevas.component.css'
})
export class MasNuevasComponent implements OnInit
{
  canciones:Cancion[]=[];
  constructor(private cancionService:CancionService){}
  
  ngOnInit(): void {
    this.cancionService.ObtenerCancionesMasNuevas().subscribe(data => {this.canciones = data;})
  }
  
}
 


