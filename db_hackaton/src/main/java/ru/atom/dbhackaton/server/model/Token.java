package ru.atom.dbhackaton.server.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by Юля on 27.03.2017.
 */

@Entity
@Table(name = "token", schema = "chat")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "token", unique = true, nullable = false, length = 20)
    private Long token;
    
    @Column(name = "username", unique = false, nullable = false, length = 20)
    private String username;

    public Token() {
    }
    
    public Token(String newToken) {
        token = Long.parseLong(newToken.substring(7));
    }

    public static Token random() {
    	Token t1 = new Token();
        Random random = new Random();
        t1.token = new Long(random.nextLong());
        return t1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return this.token.equals(token.getToken());
    }

    @Override
    public int hashCode() {
        return token.hashCode();
    }

    public Long getToken() {
        return token;
    }

    @Override
    public String toString() {
        return token.toString();
    }


}
