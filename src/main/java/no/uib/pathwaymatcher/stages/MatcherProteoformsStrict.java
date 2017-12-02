package no.uib.pathwaymatcher.stages;

import com.google.common.collect.SetMultimap;
import no.uib.pathwaymatcher.model.Proteoform;
import org.apache.commons.lang.NotImplementedException;

import java.util.Set;

import static java.lang.Math.abs;

public class MatcherProteoformsStrict extends MatcherProteoforms {

    @Override
    public SetMultimap<Proteoform, String> match(Set<Proteoform> entities) {
        throw new NotImplementedException();
    }

}