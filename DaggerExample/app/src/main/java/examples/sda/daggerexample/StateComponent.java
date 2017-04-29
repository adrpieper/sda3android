package examples.sda.daggerexample;

import javax.inject.Singleton;

import dagger.Component;
import examples.sda.daggerexample.model.State;

/**
 * Created by Przemysław on 2017-04-29.
 */
@Singleton
@Component
public interface StateComponent {
    State state();
}
