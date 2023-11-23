package hello.upload.repository;

import hello.upload.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemRepository {

    private Long sequence = 0L;
    private final Map<Long, Item> store = new HashMap<>();

    public Item findById(Long id) {
        return store.get(id);
    }

    public Item saveItem(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);

        return item;
    }
}
