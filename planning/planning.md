- generate level json from string for easy level creation?
- save enemy ai/movement
- save enemy current positions
- look at chap's inventory
- generic tiles?
- trello
- versions (releases)
- export game for each version
- testing
- find/spot bugs


---
## **GenericTile** abstract methods

`boolean move(Point point)`
- Logic for how this tile can move
- Returns *true* if a move to point is valid

`boolean interact()`
- Logic for what happens if Chap 'interacts' is on the same tile
as this tile

`String toString()`
- Info about the tile as well as tile name

`String tileId()`
- Returns an id for the tile containing all relevant info about the tile
- `empty-2-3-0-0-1`
- `tileName-x-y-z(layer)`