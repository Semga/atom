package ru.atom.resource;

/**
 * Created by Юля on 28.03.2017.
 */

import javax.ws.rs.NameBinding;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NameBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface Authorized {
}

