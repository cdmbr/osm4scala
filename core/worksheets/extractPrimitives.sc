import com.acervera.osm4scala.utils.PrimitivesExtractor._

//val pbfFile = "/home/angelcervera/projects/osm4scala/src/test/resources/com/acervera/osm4scala/osmblock/ways_block_0.osm.pbf"
// val pbfFile="/home/angelcervera/projects/osm4scala/src/test/resources/com/acervera/osm4scala/fileblock/ten_blocks.osm.pbf"
//val pbfFile = "/home/angelcervera/projects/osm/spain-latest.osm.pbf"
val pbfFile = "/home/angelcervera/projects/osm/ireland-and-northern-ireland-latest.osm.pbf"
//val pbfFile = "/home/angelcervera/projects/osm/Madrid.bbbike.osm.pbf"


//val pbfFile = "/home/angelcervera/projects/osm/spain-latest.osm.pbf"
//val extractRootFolder = "/home/angelcervera/projects/osm/primitives/spain"
val extractRootFolder = "/home/angelcervera/projects/osm/primitives/tmp"
fromPbf(pbfFile, extractRootFolder)