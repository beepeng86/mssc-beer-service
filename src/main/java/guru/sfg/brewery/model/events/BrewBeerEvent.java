package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 2019-07-21.
 */
@NoArgsConstructor
@Data
public class BrewBeerEvent {
    private BeerDto beerDto;

    public BrewBeerEvent(BeerDto beerDto) {
        this.beerDto = beerDto;
    }
}
