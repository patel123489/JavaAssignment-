package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Question")
public class Question {

    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String qname;
    String qid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }
}