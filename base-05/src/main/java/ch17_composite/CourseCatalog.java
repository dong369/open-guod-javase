package ch17_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guodd
 * @since 1.0
 */
public class CourseCatalog extends CatalogComponent {
    /**
     * 属性描述：名称
     */
    private String name;
    private Integer level;

    private List<CatalogComponent> categories = new ArrayList<>();

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        categories.add(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent category : categories) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            category.print();
        }
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        categories.remove(catalogComponent);
    }
}
