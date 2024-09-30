import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CabeceroComponent } from './cabecero/cabecero.component';
import { CuerpoComponent } from './cuerpo/cuerpo.component';
import { CuadroCancionComponent } from './cuadro-cancion/cuadro-cancion.component';
import { NovedadesComponent } from './novedades/novedades.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CabeceroComponent,CuerpoComponent,CuadroCancionComponent,NovedadesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'proyectoNuevo1';
}
