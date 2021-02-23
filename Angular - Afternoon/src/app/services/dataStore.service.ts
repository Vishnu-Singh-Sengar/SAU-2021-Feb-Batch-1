import { Injectable } from '@angular/core';
import { InMemoryDbService, RequestInfo } from 'angular-in-memory-web-api';
import { SessionDetails } from '../dashboard/dashboard.component';

@Injectable({
  providedIn: 'root'
})
export class dataStoreService implements InMemoryDbService {

  constructor() { }
  createDb() {
    let session = [
      new SessionDetails(1, "Version Control System (VCS), GIT","Session on VCS and basics of Git/GitHub", "Biresh Kumar"),
      new SessionDetails(2, "RDBMS Concepts", "Session on Relational Databases, its properties and uses.","Tarun K"),
      new SessionDetails(3, "SQL Concepts & Fundamentals", "Session on concepts of MySQL with hands on session on various queries.", "Santosh Hegde"),
      new SessionDetails(4, "Javascript 1&2", "Session on Javascript covering all concepts ranging from basics to advanced.", "Rahul Pareek" ),
      new SessionDetails(5,'Angular 1', 'Session covering basics of Angular.', 'Raviteja V'),
      new SessionDetails(6,'Angular 2', 'Session covering advanced topics and hands on to Angular.', 'Santhosh Kalisamy')
    ];
    return {session};
  }


  genId(session: SessionDetails[]): number {
    return session.length > 0 ? Math.max(...session.map(hero => hero.id)) + 1 : 4;
  }
}
