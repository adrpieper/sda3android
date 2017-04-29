package examples.sda.daggerexample;

import javax.inject.Singleton;

import dagger.Component;
import examples.sda.daggerexample.model.State;

/**
 * Created by szyms on 4/29/17.
 */

@Singleton
@Component
public interface StateComponent {

    State state();

}
