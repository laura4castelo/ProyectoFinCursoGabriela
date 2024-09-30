import { Component } from '@angular/core';

@Component({
  selector: 'app-cuadro-cancion',
  standalone: true,
  imports: [],
  templateUrl: './cuadro-cancion.component.html',
  styleUrl: './cuadro-cancion.component.css'
})
export class CuadroCancionComponent {
  playSong() {
    const progressBar = document.querySelector('.progress') as HTMLElement;
    progressBar.style.width = '100%';
    setTimeout(() => {
      progressBar.style.width = '0';
    }, 10000);
  }
}
