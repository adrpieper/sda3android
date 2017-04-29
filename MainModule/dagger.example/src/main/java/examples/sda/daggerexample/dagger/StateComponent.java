package examples.sda.daggerexample.dagger;

import javax.inject.Singleton;

import dagger.Component;
import examples.sda.daggerexample.model.State;

/**
 * Created by RENT on 2017-04-29.
 */
@Singleton
@Component
public interface StateComponent {

    State state();

}
