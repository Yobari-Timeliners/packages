// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
//
// Autogenerated from Pigeon, do not edit directly.
// See also: https://pub.dev/packages/pigeon
@file:Suppress("UNCHECKED_CAST", "ArrayInDataClass")

package com.example.test_plugin

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.common.StandardMethodCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private object EventChannelTestsPigeonUtils {

  fun wrapResult(result: Any?): List<Any?> {
    return listOf(result)
  }

  fun wrapError(exception: Throwable): List<Any?> {
    return if (exception is EventChannelTestsError) {
      listOf(exception.code, exception.message, exception.details)
    } else {
      listOf(
          exception.javaClass.simpleName,
          exception.toString(),
          "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception))
    }
  }

  fun deepEquals(a: Any?, b: Any?): Boolean {
    if (a is ByteArray && b is ByteArray) {
      return a.contentEquals(b)
    }
    if (a is IntArray && b is IntArray) {
      return a.contentEquals(b)
    }
    if (a is LongArray && b is LongArray) {
      return a.contentEquals(b)
    }
    if (a is DoubleArray && b is DoubleArray) {
      return a.contentEquals(b)
    }
    if (a is Array<*> && b is Array<*>) {
      return a.size == b.size && a.indices.all { deepEquals(a[it], b[it]) }
    }
    if (a is List<*> && b is List<*>) {
      return a.size == b.size && a.indices.all { deepEquals(a[it], b[it]) }
    }
    if (a is Map<*, *> && b is Map<*, *>) {
      return a.size == b.size &&
          a.all { (b as Map<Any?, Any?>).containsKey(it.key) && deepEquals(it.value, b[it.key]) }
    }
    return a == b
  }
}

/**
 * Error class for passing custom error details to Flutter via a thrown PlatformException.
 *
 * @property code The error code.
 * @property message The error message.
 * @property details The error details. Must be a datatype supported by the api codec.
 */
class EventChannelTestsError(
    val code: String,
    override val message: String? = null,
    val details: Any? = null
) : Throwable()

enum class EventEnum(val raw: Int) {
  ONE(0),
  TWO(1),
  THREE(2),
  FORTY_TWO(3),
  FOUR_HUNDRED_TWENTY_TWO(4);

  companion object {
    fun ofRaw(raw: Int): EventEnum? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class AnotherEventEnum(val raw: Int) {
  JUST_IN_CASE(0);

  companion object {
    fun ofRaw(raw: Int): AnotherEventEnum? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/**
 * A class containing all supported nullable types.
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class EventAllNullableTypes(
    val aNullableBool: Boolean? = null,
    val aNullableInt: Long? = null,
    val aNullableInt64: Long? = null,
    val aNullableDouble: Double? = null,
    val aNullableByteArray: ByteArray? = null,
    val aNullable4ByteArray: IntArray? = null,
    val aNullable8ByteArray: LongArray? = null,
    val aNullableFloatArray: DoubleArray? = null,
    val aNullableEnum: EventEnum? = null,
    val anotherNullableEnum: AnotherEventEnum? = null,
    val aNullableString: String? = null,
    val aNullableObject: Any? = null,
    val allNullableTypes: EventAllNullableTypes? = null,
    val list: List<Any?>? = null,
    val stringList: List<String?>? = null,
    val intList: List<Long?>? = null,
    val doubleList: List<Double?>? = null,
    val boolList: List<Boolean?>? = null,
    val enumList: List<EventEnum?>? = null,
    val objectList: List<Any?>? = null,
    val listList: List<List<Any?>?>? = null,
    val mapList: List<Map<Any?, Any?>?>? = null,
    val recursiveClassList: List<EventAllNullableTypes?>? = null,
    val map: Map<Any, Any?>? = null,
    val stringMap: Map<String?, String?>? = null,
    val intMap: Map<Long?, Long?>? = null,
    val enumMap: Map<EventEnum?, EventEnum?>? = null,
    val objectMap: Map<Any?, Any?>? = null,
    val listMap: Map<Long?, List<Any?>?>? = null,
    val mapMap: Map<Long?, Map<Any?, Any?>?>? = null,
    val recursiveClassMap: Map<Long?, EventAllNullableTypes?>? = null
) {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): EventAllNullableTypes {
      val aNullableBool = pigeonVar_list[0] as Boolean?
      val aNullableInt = pigeonVar_list[1] as Long?
      val aNullableInt64 = pigeonVar_list[2] as Long?
      val aNullableDouble = pigeonVar_list[3] as Double?
      val aNullableByteArray = pigeonVar_list[4] as ByteArray?
      val aNullable4ByteArray = pigeonVar_list[5] as IntArray?
      val aNullable8ByteArray = pigeonVar_list[6] as LongArray?
      val aNullableFloatArray = pigeonVar_list[7] as DoubleArray?
      val aNullableEnum = pigeonVar_list[8] as EventEnum?
      val anotherNullableEnum = pigeonVar_list[9] as AnotherEventEnum?
      val aNullableString = pigeonVar_list[10] as String?
      val aNullableObject = pigeonVar_list[11]
      val allNullableTypes = pigeonVar_list[12] as EventAllNullableTypes?
      val list = pigeonVar_list[13] as List<Any?>?
      val stringList = pigeonVar_list[14] as List<String?>?
      val intList = pigeonVar_list[15] as List<Long?>?
      val doubleList = pigeonVar_list[16] as List<Double?>?
      val boolList = pigeonVar_list[17] as List<Boolean?>?
      val enumList = pigeonVar_list[18] as List<EventEnum?>?
      val objectList = pigeonVar_list[19] as List<Any?>?
      val listList = pigeonVar_list[20] as List<List<Any?>?>?
      val mapList = pigeonVar_list[21] as List<Map<Any?, Any?>?>?
      val recursiveClassList = pigeonVar_list[22] as List<EventAllNullableTypes?>?
      val map = pigeonVar_list[23] as Map<Any, Any?>?
      val stringMap = pigeonVar_list[24] as Map<String?, String?>?
      val intMap = pigeonVar_list[25] as Map<Long?, Long?>?
      val enumMap = pigeonVar_list[26] as Map<EventEnum?, EventEnum?>?
      val objectMap = pigeonVar_list[27] as Map<Any?, Any?>?
      val listMap = pigeonVar_list[28] as Map<Long?, List<Any?>?>?
      val mapMap = pigeonVar_list[29] as Map<Long?, Map<Any?, Any?>?>?
      val recursiveClassMap = pigeonVar_list[30] as Map<Long?, EventAllNullableTypes?>?
      return EventAllNullableTypes(
          aNullableBool,
          aNullableInt,
          aNullableInt64,
          aNullableDouble,
          aNullableByteArray,
          aNullable4ByteArray,
          aNullable8ByteArray,
          aNullableFloatArray,
          aNullableEnum,
          anotherNullableEnum,
          aNullableString,
          aNullableObject,
          allNullableTypes,
          list,
          stringList,
          intList,
          doubleList,
          boolList,
          enumList,
          objectList,
          listList,
          mapList,
          recursiveClassList,
          map,
          stringMap,
          intMap,
          enumMap,
          objectMap,
          listMap,
          mapMap,
          recursiveClassMap)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        aNullableBool,
        aNullableInt,
        aNullableInt64,
        aNullableDouble,
        aNullableByteArray,
        aNullable4ByteArray,
        aNullable8ByteArray,
        aNullableFloatArray,
        aNullableEnum,
        anotherNullableEnum,
        aNullableString,
        aNullableObject,
        allNullableTypes,
        list,
        stringList,
        intList,
        doubleList,
        boolList,
        enumList,
        objectList,
        listList,
        mapList,
        recursiveClassList,
        map,
        stringMap,
        intMap,
        enumMap,
        objectMap,
        listMap,
        mapMap,
        recursiveClassMap,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is EventAllNullableTypes) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/**
 * Generated class from Pigeon that represents data sent in messages. This class should not be
 * extended by any user class outside of the generated file.
 */
sealed class PlatformEvent
/** Generated class from Pigeon that represents data sent in messages. */
data class IntEvent(val value: Long) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): IntEvent {
      val value = pigeonVar_list[0] as Long
      return IntEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is IntEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
data class StringEvent(val value: String) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): StringEvent {
      val value = pigeonVar_list[0] as String
      return StringEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is StringEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
data class BoolEvent(val value: Boolean) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): BoolEvent {
      val value = pigeonVar_list[0] as Boolean
      return BoolEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is BoolEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
data class DoubleEvent(val value: Double) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): DoubleEvent {
      val value = pigeonVar_list[0] as Double
      return DoubleEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is DoubleEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
data class ObjectsEvent(val value: Any) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): ObjectsEvent {
      val value = pigeonVar_list[0] as Any
      return ObjectsEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is ObjectsEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
data class EnumEvent(val value: EventEnum) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): EnumEvent {
      val value = pigeonVar_list[0] as EventEnum
      return EnumEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is EnumEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
data class ClassEvent(val value: EventAllNullableTypes) : PlatformEvent() {
  companion object {
    fun fromList(pigeonVar_list: List<Any?>): ClassEvent {
      val value = pigeonVar_list[0] as EventAllNullableTypes
      return ClassEvent(value)
    }
  }

  fun toList(): List<Any?> {
    return listOf(
        value,
    )
  }

  override fun equals(other: Any?): Boolean {
    if (other !is ClassEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

/** Generated class from Pigeon that represents data sent in messages. */
class EmptyEvent() : PlatformEvent() {
  companion object {
    @Suppress("UNUSED_PARAMETER")
    fun fromList(pigeonVar_list: List<Any?>): EmptyEvent {
      return EmptyEvent()
    }
  }

  fun toList(): List<Any?> {
    return listOf()
  }

  override fun equals(other: Any?): Boolean {
    if (other !is EmptyEvent) {
      return false
    }
    if (this === other) {
      return true
    }
    return EventChannelTestsPigeonUtils.deepEquals(toList(), other.toList())
  }

  override fun hashCode(): Int = toList().hashCode()
}

private open class EventChannelTestsPigeonCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      129.toByte() -> {
        return (readValue(buffer) as Long?)?.let { EventEnum.ofRaw(it.toInt()) }
      }
      130.toByte() -> {
        return (readValue(buffer) as Long?)?.let { AnotherEventEnum.ofRaw(it.toInt()) }
      }
      131.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { EventAllNullableTypes.fromList(it) }
      }
      132.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { IntEvent.fromList(it) }
      }
      133.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { StringEvent.fromList(it) }
      }
      134.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { BoolEvent.fromList(it) }
      }
      135.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { DoubleEvent.fromList(it) }
      }
      136.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { ObjectsEvent.fromList(it) }
      }
      137.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { EnumEvent.fromList(it) }
      }
      138.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { ClassEvent.fromList(it) }
      }
      139.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let { EmptyEvent.fromList(it) }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }

  override fun writeValue(stream: ByteArrayOutputStream, value: Any?) {
    when (value) {
      is EventEnum -> {
        stream.write(129)
        writeValue(stream, value.raw)
      }
      is AnotherEventEnum -> {
        stream.write(130)
        writeValue(stream, value.raw)
      }
      is EventAllNullableTypes -> {
        stream.write(131)
        writeValue(stream, value.toList())
      }
      is IntEvent -> {
        stream.write(132)
        writeValue(stream, value.toList())
      }
      is StringEvent -> {
        stream.write(133)
        writeValue(stream, value.toList())
      }
      is BoolEvent -> {
        stream.write(134)
        writeValue(stream, value.toList())
      }
      is DoubleEvent -> {
        stream.write(135)
        writeValue(stream, value.toList())
      }
      is ObjectsEvent -> {
        stream.write(136)
        writeValue(stream, value.toList())
      }
      is EnumEvent -> {
        stream.write(137)
        writeValue(stream, value.toList())
      }
      is ClassEvent -> {
        stream.write(138)
        writeValue(stream, value.toList())
      }
      is EmptyEvent -> {
        stream.write(139)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

val EventChannelTestsPigeonMethodCodec = StandardMethodCodec(EventChannelTestsPigeonCodec())

private class EventChannelTestsPigeonStreamHandler<T>(
    val wrapper: EventChannelTestsPigeonEventChannelWrapper<T>
) : EventChannel.StreamHandler {
  var pigeonSink: PigeonEventSink<T>? = null

  override fun onListen(p0: Any?, sink: EventChannel.EventSink) {
    pigeonSink = PigeonEventSink<T>(sink)
    wrapper.onListen(p0, pigeonSink!!)
  }

  override fun onCancel(p0: Any?) {
    pigeonSink = null
    wrapper.onCancel(p0)
  }
}

interface EventChannelTestsPigeonEventChannelWrapper<T> {
  open fun onListen(p0: Any?, sink: PigeonEventSink<T>) {}

  open fun onCancel(p0: Any?) {}
}

class PigeonEventSink<T>(private val sink: EventChannel.EventSink) {
  fun success(value: T) {
    sink.success(value)
  }

  fun error(errorCode: String, errorMessage: String?, errorDetails: Any?) {
    sink.error(errorCode, errorMessage, errorDetails)
  }

  fun endOfStream() {
    sink.endOfStream()
  }
}

abstract class StreamIntsStreamHandler : EventChannelTestsPigeonEventChannelWrapper<Long> {
  companion object {
    fun register(
        messenger: BinaryMessenger,
        streamHandler: StreamIntsStreamHandler,
        instanceName: String = ""
    ) {
      var channelName: String =
          "dev.flutter.pigeon.pigeon_integration_tests.EventChannelMethods.streamInts"
      if (instanceName.isNotEmpty()) {
        channelName += ".$instanceName"
      }
      val internalStreamHandler = EventChannelTestsPigeonStreamHandler<Long>(streamHandler)
      EventChannel(messenger, channelName, EventChannelTestsPigeonMethodCodec)
          .setStreamHandler(internalStreamHandler)
    }
  }
}

abstract class StreamEventsStreamHandler :
    EventChannelTestsPigeonEventChannelWrapper<PlatformEvent> {
  companion object {
    fun register(
        messenger: BinaryMessenger,
        streamHandler: StreamEventsStreamHandler,
        instanceName: String = ""
    ) {
      var channelName: String =
          "dev.flutter.pigeon.pigeon_integration_tests.EventChannelMethods.streamEvents"
      if (instanceName.isNotEmpty()) {
        channelName += ".$instanceName"
      }
      val internalStreamHandler = EventChannelTestsPigeonStreamHandler<PlatformEvent>(streamHandler)
      EventChannel(messenger, channelName, EventChannelTestsPigeonMethodCodec)
          .setStreamHandler(internalStreamHandler)
    }
  }
}

abstract class StreamConsistentNumbersStreamHandler :
    EventChannelTestsPigeonEventChannelWrapper<Long> {
  companion object {
    fun register(
        messenger: BinaryMessenger,
        streamHandler: StreamConsistentNumbersStreamHandler,
        instanceName: String = ""
    ) {
      var channelName: String =
          "dev.flutter.pigeon.pigeon_integration_tests.EventChannelMethods.streamConsistentNumbers"
      if (instanceName.isNotEmpty()) {
        channelName += ".$instanceName"
      }
      val internalStreamHandler = EventChannelTestsPigeonStreamHandler<Long>(streamHandler)
      EventChannel(messenger, channelName, EventChannelTestsPigeonMethodCodec)
          .setStreamHandler(internalStreamHandler)
    }
  }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface SealedClassApi {
  fun echo(event: PlatformEvent): PlatformEvent

  companion object {
    /** The codec used by SealedClassApi. */
    val codec: MessageCodec<Any?> by lazy { EventChannelTestsPigeonCodec() }
    /** Sets up an instance of `SealedClassApi` to handle messages through the `binaryMessenger`. */
    @JvmOverloads
    fun setUp(
        binaryMessenger: BinaryMessenger,
        api: SealedClassApi?,
        messageChannelSuffix: String = ""
    ) {
      val separatedMessageChannelSuffix =
          if (messageChannelSuffix.isNotEmpty()) ".$messageChannelSuffix" else ""
      run {
        val channel =
            BasicMessageChannel<Any?>(
                binaryMessenger,
                "dev.flutter.pigeon.pigeon_integration_tests.SealedClassApi.echo$separatedMessageChannelSuffix",
                codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val eventArg = args[0] as PlatformEvent
            val wrapped: List<Any?> =
                try {
                  listOf(api.echo(eventArg))
                } catch (exception: Throwable) {
                  EventChannelTestsPigeonUtils.wrapError(exception)
                }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}
