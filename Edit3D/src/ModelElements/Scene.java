package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
        this.id = id;

        if (models.size() == 0) this.models.add(new PoligonalModel(null));
        if (cameras.size() == 0) this.cameras.add(new Camera(null, null));
    }
    public Type method1(Type type) {
        return type;
    }
    public Type method2(Type type1, Type type2) {
        return type1;
    }
}
