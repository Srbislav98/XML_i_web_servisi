import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  role: any;

  constructor(
    private router: Router,
    ) { }

  ngOnInit(): void {
  }

  

  goToHome() {
    this.router.navigate(['']);
  }

  goToResenje(){
    this.router.navigate(['/resenje']);
  }

  goToLogIn() {}
  goToRegistration() {}

  /*goToLogIn() {
    //localStorage.removeItem('user');
    //localStorage.removeItem('uloga');
    this.router.navigate(['/login']);
  }

  goToRegistration() {
    this.router.navigate(['/registration']);
  }

  goToProfile() {
    this.router.navigateByUrl('/profil');
  }

  logOut() {
    this.authenticationService.logout().subscribe(
			result => {
        localStorage.removeItem('user');
        localStorage.removeItem('accessToken');
        localStorage.removeItem('uloga');
				this.toastr.success('You have been successfully logged out!');
				this.router.navigate(['login']);
			},
			error => {
				this.toastr.error('Some error. Try again.');
			}
		);
  }*/

}
