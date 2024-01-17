import { Component, OnInit } from '@angular/core';
import { SExperienciaService } from '../../service/s-experiencia.service';
import { Router } from '@angular/router'; 
import { Experiencia } from '../../model/experiencia';

@Component({
  selector: 'app-new-experiencia',
  templateUrl: './new-experiencia.component.html',
  styleUrl: './new-experiencia.component.css'
})
export class NewExperienciaComponent implements OnInit{

  nombreE: string  = '';
  descripcionE: string = '';

  constructor(private sExperiencia: SExperienciaService, private router: Router){}
  ngOnInit(): void {
  }

  onCreate():void{
    const exp = new Experiencia(this.nombreE, this.descripcionE);
    this.sExperiencia.save(exp).subscribe(data => {
      alert("experiencia agregada");
      this.router.navigate(['']);
    }, err=>{
      alert("fallo");
      this.router.navigate(['']);
    });
  }
}
