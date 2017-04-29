package examples.sda.daggerexample.model;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by RENT on 2017-04-29.
 */
@Singleton
@Component
public interface StateComponent {
    State state();
}
