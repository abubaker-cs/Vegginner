package com.juancoob.nanodegree.and.vegginner.di.databaseScope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * This is the scope to use some providers
 *
 * Created by Juan Antonio Cobos Obrero on 28/07/18.
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface RoomScope {
}
