package examples.sda.daggerexample.model;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by LenovoM on 2017-04-29.
 */
@Singleton
@Component
public interface StateComponent {
    State state();
}
