import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class gpsDistanceTest {
    @Test
    public void test(){
        //Hornsgatan 52 stockholm
        double startpointLat = 59.3190379;
        double startpointLng = 18.0628555;
        //Hornsgatan 22 stockholm
        double endpointLat = 59.3197289;
        double endpointLng = 18.0681564;

        double result = getDistance(startpointLat,
                                    startpointLng,
                                    endpointLat,
                                    endpointLng);

        assertEquals("0.31022413957098754", String.valueOf(result));
    }

    private double getDistance(double startpointLat,
                               double startpointLng,
                               double endpointLat,
                               double endpointLng){
        final double d2r = (Math.PI / 180);
        final int earthRadius = 6367;

        double dlong = (endpointLng - startpointLng) * d2r;
        double dlat = (endpointLat - startpointLat) * d2r;
        double a = Math.pow(Math.sin(dlat / 2.0), 2)
                 + Math.cos(startpointLat * d2r)
                 * Math.cos(endpointLat * d2r)
                 * Math.pow(Math.sin(dlong / 2.0), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c;
    }
}
