import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({ providedIn: 'root' })
export class LoginService {
  private baseUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) {}

  homeService(username: string, password: string) {
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + btoa(username + ':' + password),
    });
    return this.http.post(this.baseUrl + '/login', {headers});
  }
}
