package external.pokemon_gen_two

trait PokemonGenTwo {
  def name: String
}

trait NextForm {
  def nextForm: PokemonGenTwo
}

object Cyndaquil extends PokemonGenTwo with NextForm {
  override def name: String = "Cyndaquil"
  override def nextForm: PokemonGenTwo = Quilava
}

object Quilava extends PokemonGenTwo with NextForm {
  override def name: String = "Quilava"
  override def nextForm: PokemonGenTwo = Typhlosion
}

object Typhlosion extends PokemonGenTwo {
  override def name: String = "Typhlosion"
}



