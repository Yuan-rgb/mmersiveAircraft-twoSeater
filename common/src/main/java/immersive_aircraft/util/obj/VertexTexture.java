package immersive_aircraft.util.obj;

// This code was written by myself, Sean R. Owens, sean at guild dot net,
// and is released to the public domain. Share and enjoy. Since some
// people argue that it is impossible to release software to the public
// domain, you are also free to use this code under any version of the
// GPL, LPGL, Apache, or BSD licenses, or contact me for use of another
// license.  (I generally don't care so I'll almost certainly say yes.)
// In addition this code may also be used under the "unlicense" described
// at http://unlicense.org/ .  See the file UNLICENSE in the repo.

public class VertexTexture {
    public final float u;
    public final float v;

    VertexTexture(float u, float v) {
        this.u = u;
        this.v = v;
    }

    public String toString() {
        return u + "," + v;
    }
}