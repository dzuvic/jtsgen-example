import {Component, OnInit} from "@angular/core";
import {Subject} from "rxjs/Subject";
import {Http} from "@angular/http";
import "rxjs/add/operator/map";
import Person = exampleApi.Person;


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  persons:Person[]=[];

  persons$: Subject<Person[]> = new Subject();

  constructor(private http: Http) {

    this.http.get("/api/person/list").map( response =>
      response.json()
    ).subscribe(
      thePersons => this.persons$.next(thePersons)
    );

    this.persons$.subscribe( (thePersonList : Person[]) => this.persons = thePersonList);

  }

  ngOnInit() {

  }

}
